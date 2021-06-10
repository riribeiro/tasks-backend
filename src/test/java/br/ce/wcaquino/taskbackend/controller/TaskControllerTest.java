package br.ce.wcaquino.taskbackend.controller;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.ce.wcaquino.taskbackend.model.Task;
import br.ce.wcaquino.taskbackend.utils.ValidationException;

public class TaskControllerTest {
	
	@Mock
		private TaskRepo taskRepo;
	
	@InjectMocks
    	private TaskController Taskcontroller;
    
    @Before
    public void setup() {
    	MockitoAnnotations.initMocks(this);
    }
    
	
		
	public void NaoDeveSalvarTarefaSemDescricao() {
	
	}
	 
	public void NaoDeveSalvarTarefaSemData()
	{
		
		
	}
	
	public void NaoDeveSalvarTarefaComDataPassada()
	{
		
	}

	
	public void DeveSalvarTarefaComSucesso()
	{
		
	}
}
