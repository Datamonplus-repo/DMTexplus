package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwnumpz2", "/app.webwnumpz2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwnumpz2 extends GXWebObjectStub
{
   public webwnumpz2( )
   {
   }

   public webwnumpz2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwnumpz2.class ));
   }

   public webwnumpz2( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwnumpz2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwnumpz2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Numeracion Piezas Almacen";
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

