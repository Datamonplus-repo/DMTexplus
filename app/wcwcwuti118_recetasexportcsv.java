package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcwuti118_recetasexportcsv", "/app.wcwcwuti118_recetasexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcwuti118_recetasexportcsv extends GXWebObjectStub
{
   public wcwcwuti118_recetasexportcsv( )
   {
   }

   public wcwcwuti118_recetasexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcwuti118_recetasexportcsv.class ));
   }

   public wcwcwuti118_recetasexportcsv( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcwuti118_recetasexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcwuti118_recetasexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWCWUti118_Recetas Export CSV";
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

