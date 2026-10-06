package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.consumoscolorservice_wc", "/app.formulaciontinte.consumoscolorservice_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consumoscolorservice_wc extends GXWebObjectStub
{
   public consumoscolorservice_wc( )
   {
   }

   public consumoscolorservice_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consumoscolorservice_wc.class ));
   }

   public consumoscolorservice_wc( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consumoscolorservice_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consumoscolorservice_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " tabla TWeightProduct";
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

