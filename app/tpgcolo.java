package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpgcolo", "/app.tpgcolo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpgcolo extends GXWebObjectStub
{
   public tpgcolo( )
   {
   }

   public tpgcolo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpgcolo.class ));
   }

   public tpgcolo( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpgcolo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpgcolo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIO GLOBAL COLOR";
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

