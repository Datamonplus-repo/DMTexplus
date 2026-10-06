package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttaes02", "/app.ttaes02"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttaes02 extends GXWebObjectStub
{
   public ttaes02( )
   {
   }

   public ttaes02( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttaes02.class ));
   }

   public ttaes02( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttaes02_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttaes02_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLAS DE DOSIFICACION Productos";
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

