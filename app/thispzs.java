package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thispzs", "/app.thispzs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thispzs extends GXWebObjectStub
{
   public thispzs( )
   {
   }

   public thispzs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thispzs.class ));
   }

   public thispzs( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thispzs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thispzs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PIEZAS EN LHIPRO";
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

