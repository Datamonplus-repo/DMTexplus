package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webreoperadosinternos", "/app.webreoperadosinternos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webreoperadosinternos extends GXWebObjectStub
{
   public webreoperadosinternos( )
   {
   }

   public webreoperadosinternos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webreoperadosinternos.class ));
   }

   public webreoperadosinternos( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webreoperadosinternos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webreoperadosinternos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Reoperados Internos";
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

