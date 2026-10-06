package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.veranyadidas_", "/app.formulaciontinte.veranyadidas_"})
@jakarta.servlet.annotation.MultipartConfig
public final  class veranyadidas_ extends GXWebObjectStub
{
   public veranyadidas_( )
   {
   }

   public veranyadidas_( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( veranyadidas_.class ));
   }

   public veranyadidas_( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new veranyadidas__impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new veranyadidas__impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ver Añadidas";
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

