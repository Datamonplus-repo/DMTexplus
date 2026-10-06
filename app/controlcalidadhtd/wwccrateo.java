package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.wwccrateo", "/app.controlcalidadhtd.wwccrateo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwccrateo extends GXWebObjectStub
{
   public wwccrateo( )
   {
   }

   public wwccrateo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwccrateo.class ));
   }

   public wwccrateo( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwccrateo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwccrateo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Comparaçion Real / Teórico";
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

