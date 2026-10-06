package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcrepuestomovimientosexportcsv", "/app.wcrepuestomovimientosexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcrepuestomovimientosexportcsv extends GXWebObjectStub
{
   public wcrepuestomovimientosexportcsv( )
   {
   }

   public wcrepuestomovimientosexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcrepuestomovimientosexportcsv.class ));
   }

   public wcrepuestomovimientosexportcsv( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcrepuestomovimientosexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcrepuestomovimientosexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCRepuesto Movimientos Export CSV";
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

