package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.tincc", "/app.controlcalidadhtd.tincc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tincc extends GXWebObjectStub
{
   public tincc( )
   {
   }

   public tincc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tincc.class ));
   }

   public tincc( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tincc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tincc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "IN CC SIN COMMIT";
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

