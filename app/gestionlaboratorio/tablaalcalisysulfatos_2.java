package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.tablaalcalisysulfatos_2", "/app.gestionlaboratorio.tablaalcalisysulfatos_2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tablaalcalisysulfatos_2 extends GXWebObjectStub
{
   public tablaalcalisysulfatos_2( )
   {
   }

   public tablaalcalisysulfatos_2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tablaalcalisysulfatos_2.class ));
   }

   public tablaalcalisysulfatos_2( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tablaalcalisysulfatos_2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tablaalcalisysulfatos_2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla Alcalis y Sulfatos";
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

