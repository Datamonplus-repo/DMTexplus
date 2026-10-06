package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.estructuratablalmacpr", "/app.formulaciontinte.estructuratablalmacpr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class estructuratablalmacpr extends GXWebObjectStub
{
   public estructuratablalmacpr( )
   {
   }

   public estructuratablalmacpr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( estructuratablalmacpr.class ));
   }

   public estructuratablalmacpr( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new estructuratablalmacpr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new estructuratablalmacpr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Estructura Tabla LMACPR";
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

