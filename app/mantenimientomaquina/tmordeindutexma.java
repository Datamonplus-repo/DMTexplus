package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmordeindutexma", "/app.mantenimientomaquina.tmordeindutexma"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordeindutexma extends GXWebObjectStub
{
   public tmordeindutexma( )
   {
   }

   public tmordeindutexma( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordeindutexma.class ));
   }

   public tmordeindutexma( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordeindutexma_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordeindutexma_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ordenes de Mantenimiento";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

