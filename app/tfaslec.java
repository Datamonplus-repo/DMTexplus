package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfaslec", "/app.tfaslec"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfaslec extends GXWebObjectStub
{
   public tfaslec( )
   {
   }

   public tfaslec( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfaslec.class ));
   }

   public tfaslec( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfaslec_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfaslec_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENTRADA DE FASES DESDE LECTOR";
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

