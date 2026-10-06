package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tescfob", "/app.tescfob"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tescfob extends GXWebObjectStub
{
   public tescfob( )
   {
   }

   public tescfob( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tescfob.class ));
   }

   public tescfob( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tescfob_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tescfob_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ESCANDALLO FORMULAS BROS";
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

