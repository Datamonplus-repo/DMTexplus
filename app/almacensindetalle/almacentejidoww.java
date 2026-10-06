package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.almacentejidoww", "/app.almacensindetalle.almacentejidoww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoww extends GXWebObjectStub
{
   public almacentejidoww( )
   {
   }

   public almacentejidoww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoww.class ));
   }

   public almacentejidoww( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Almacen Tejido";
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

