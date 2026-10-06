package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.controlcalidadvariableww", "/app.controlcalidadhtd.controlcalidadvariableww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlcalidadvariableww extends GXWebObjectStub
{
   public controlcalidadvariableww( )
   {
   }

   public controlcalidadvariableww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlcalidadvariableww.class ));
   }

   public controlcalidadvariableww( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlcalidadvariableww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlcalidadvariableww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Control Calidad Variable";
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

