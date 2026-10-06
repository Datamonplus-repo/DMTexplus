package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwuti010", "/app.webwuti010"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwuti010 extends GXWebObjectStub
{
   public webwuti010( )
   {
   }

   public webwuti010( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwuti010.class ));
   }

   public webwuti010( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwuti010_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwuti010_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion LOTE Receta Hdr";
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

