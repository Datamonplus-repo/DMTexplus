package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tsecciothojamawc", "/app.ficherosbasicos.tsecciothojamawc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsecciothojamawc extends GXWebObjectStub
{
   public tsecciothojamawc( )
   {
   }

   public tsecciothojamawc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsecciothojamawc.class ));
   }

   public tsecciothojamawc( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsecciothojamawc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsecciothojamawc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TSECCIOTHoja Ma WC";
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

