package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tincint", "/app.tincint"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tincint extends GXWebObjectStub
{
   public tincint( )
   {
   }

   public tincint( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tincint.class ));
   }

   public tincint( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tincint_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tincint_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "INCREMENTO PRECIO INTENSIDAD";
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

