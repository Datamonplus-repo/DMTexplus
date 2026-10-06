package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tinditex", "/app.ficherosbasicos.tinditex"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tinditex extends GXWebObjectStub
{
   public tinditex( )
   {
   }

   public tinditex( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tinditex.class ));
   }

   public tinditex( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tinditex_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tinditex_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Certificaciones";
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

