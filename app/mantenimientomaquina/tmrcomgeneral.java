package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmrcomgeneral", "/app.mantenimientomaquina.tmrcomgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrcomgeneral extends GXWebObjectStub
{
   public tmrcomgeneral( )
   {
   }

   public tmrcomgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrcomgeneral.class ));
   }

   public tmrcomgeneral( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrcomgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrcomgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMRCom General";
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

