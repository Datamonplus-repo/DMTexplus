package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwuti011", "/app.webwuti011"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwuti011 extends GXWebObjectStub
{
   public webwuti011( )
   {
   }

   public webwuti011( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwuti011.class ));
   }

   public webwuti011( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwuti011_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwuti011_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion LOTE Consumos Manuales";
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

