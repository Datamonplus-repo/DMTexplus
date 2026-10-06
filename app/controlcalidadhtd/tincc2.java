package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.tincc2", "/app.controlcalidadhtd.tincc2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tincc2 extends GXWebObjectStub
{
   public tincc2( )
   {
   }

   public tincc2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tincc2.class ));
   }

   public tincc2( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tincc2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tincc2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "IN CC CON COMMIT";
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

