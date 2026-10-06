package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.taddfin", "/app.taddfin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class taddfin extends GXWebObjectStub
{
   public taddfin( )
   {
   }

   public taddfin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( taddfin.class ));
   }

   public taddfin( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new taddfin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new taddfin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion Defecto";
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

