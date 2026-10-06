package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbpkb", "/app.talbpkb"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbpkb extends GXWebObjectStub
{
   public talbpkb( )
   {
   }

   public talbpkb( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbpkb.class ));
   }

   public talbpkb( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbpkb_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbpkb_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALBARAN PACKING LIST S.A.BROS";
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

