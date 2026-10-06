package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talmaceww", "/app.talmaceww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talmaceww extends GXWebObjectStub
{
   public talmaceww( )
   {
   }

   public talmaceww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talmaceww.class ));
   }

   public talmaceww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talmaceww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talmaceww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Almacenes";
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

