package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprocedprompt", "/app.tprocedprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprocedprompt extends GXWebObjectStub
{
   public tprocedprompt( )
   {
   }

   public tprocedprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprocedprompt.class ));
   }

   public tprocedprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprocedprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprocedprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona PROCEDENCIAS";
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

