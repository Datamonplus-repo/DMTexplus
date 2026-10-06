package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttr0800", "/app.ttr0800"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttr0800 extends GXWebObjectStub
{
   public ttr0800( )
   {
   }

   public ttr0800( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttr0800.class ));
   }

   public ttr0800( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttr0800_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttr0800_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIOS REFERENCIA TINTEX";
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

