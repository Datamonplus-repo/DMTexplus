package app.test ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.test.textplantillafiltros", "/app.test.textplantillafiltros"})
@jakarta.servlet.annotation.MultipartConfig
public final  class textplantillafiltros extends GXWebObjectStub
{
   public textplantillafiltros( )
   {
   }

   public textplantillafiltros( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( textplantillafiltros.class ));
   }

   public textplantillafiltros( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new textplantillafiltros_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new textplantillafiltros_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Text Plantilla Filtros";
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

