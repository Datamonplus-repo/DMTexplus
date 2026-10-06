package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarticu_ww", "/app.tarticu_ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarticu_ww extends GXWebObjectStub
{
   public tarticu_ww( )
   {
   }

   public tarticu_ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarticu_ww.class ));
   }

   public tarticu_ww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarticu_ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarticu_ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Ficha Tecnica (Articulo)";
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

