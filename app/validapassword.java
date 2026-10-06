package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.validapassword", "/app.validapassword"})
@jakarta.servlet.annotation.MultipartConfig
public final  class validapassword extends GXWebObjectStub
{
   public validapassword( )
   {
   }

   public validapassword( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( validapassword.class ));
   }

   public validapassword( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new validapassword_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new validapassword_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Validação de Senha";
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

