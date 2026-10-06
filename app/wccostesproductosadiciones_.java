package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wccostesproductosadiciones_", "/app.wccostesproductosadiciones_"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wccostesproductosadiciones_ extends GXWebObjectStub
{
   public wccostesproductosadiciones_( )
   {
   }

   public wccostesproductosadiciones_( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wccostesproductosadiciones_.class ));
   }

   public wccostesproductosadiciones_( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wccostesproductosadiciones__impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wccostesproductosadiciones__impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " HISTORICO RECETAS AÑAD.BALANZ.";
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

