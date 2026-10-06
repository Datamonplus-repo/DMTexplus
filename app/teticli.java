package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.teticli", "/app.teticli"})
@jakarta.servlet.annotation.MultipartConfig
public final  class teticli extends GXWebObjectStub
{
   public teticli( )
   {
   }

   public teticli( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( teticli.class ));
   }

   public teticli( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new teticli_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new teticli_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OPCIONES IMPRESION ETIQUETAS";
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

