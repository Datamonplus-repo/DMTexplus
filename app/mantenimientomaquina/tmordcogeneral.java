package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmordcogeneral", "/app.mantenimientomaquina.tmordcogeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordcogeneral extends GXWebObjectStub
{
   public tmordcogeneral( )
   {
   }

   public tmordcogeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordcogeneral.class ));
   }

   public tmordcogeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordcogeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordcogeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMOrd Co General";
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

