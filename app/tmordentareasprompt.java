package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordentareasprompt", "/app.tmordentareasprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordentareasprompt extends GXWebObjectStub
{
   public tmordentareasprompt( )
   {
   }

   public tmordentareasprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordentareasprompt.class ));
   }

   public tmordentareasprompt( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordentareasprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordentareasprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Tareas";
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

