package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testcolww", "/app.testcolww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testcolww extends GXWebObjectStub
{
   public testcolww( )
   {
   }

   public testcolww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testcolww.class ));
   }

   public testcolww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testcolww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testcolww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Colores p/estampación";
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

