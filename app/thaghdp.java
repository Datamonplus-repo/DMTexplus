package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thaghdp", "/app.thaghdp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thaghdp extends GXWebObjectStub
{
   public thaghdp( )
   {
   }

   public thaghdp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thaghdp.class ));
   }

   public thaghdp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thaghdp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thaghdp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HISTORICO AGRUPACIONES P/PDA";
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

