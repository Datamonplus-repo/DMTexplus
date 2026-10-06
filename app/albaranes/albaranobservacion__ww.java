package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranes.albaranobservacion__ww", "/app.albaranes.albaranobservacion__ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class albaranobservacion__ww extends GXWebObjectStub
{
   public albaranobservacion__ww( )
   {
   }

   public albaranobservacion__ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( albaranobservacion__ww.class ));
   }

   public albaranobservacion__ww( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new albaranobservacion__ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new albaranobservacion__ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Guias / Observación";
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

