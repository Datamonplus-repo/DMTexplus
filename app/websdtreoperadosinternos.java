package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.websdtreoperadosinternos", "/app.websdtreoperadosinternos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class websdtreoperadosinternos extends GXWebObjectStub
{
   public websdtreoperadosinternos( )
   {
   }

   public websdtreoperadosinternos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( websdtreoperadosinternos.class ));
   }

   public websdtreoperadosinternos( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new websdtreoperadosinternos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new websdtreoperadosinternos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Reoperados Internos (SDT)";
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

