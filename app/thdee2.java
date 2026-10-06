package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thdee2", "/app.thdee2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thdee2 extends GXWebObjectStub
{
   public thdee2( )
   {
   }

   public thdee2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thdee2.class ));
   }

   public thdee2( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thdee2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thdee2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENTREGA TINTADAS A ENCONAR";
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

