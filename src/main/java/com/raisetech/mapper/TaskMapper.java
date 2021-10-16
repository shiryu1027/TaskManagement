package com.raisetech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.raisetech.entity.Task;
import com.raisetech.form.DetailForm;

@Mapper
public interface TaskMapper {
	
	// 未完了タスクの一覧取得
	List<Task> selectIncompleteTasks();
	
	// 完了タスクの一覧取得
	List<Task> selectCompletedTasks();
	
	//タスクの詳細情報取得
	Task selectTask(int taskId);
	
    //タスクの一件登録
	void insertTask(Task task);
	
	// 完了フラグを未完了から完了に更新
	void updateCompletedFlagToTrue(int taskId);
	
	//タスクの詳細情報更新（完了フラグ変更なし）
		void updateTaskDetails(DetailForm form);
	
	//タスクの一件削除
	void deleteTask(int taskId);

}
