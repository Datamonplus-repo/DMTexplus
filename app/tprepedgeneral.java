package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprepedgeneral", "/app.tprepedgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprepedgeneral extends GXWebObjectStub
{
   public tprepedgeneral( )
   {
   }

   public tprepedgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprepedgeneral.class ));
   }

   public tprepedgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprepedgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprepedgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPREPEDGeneral";
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

