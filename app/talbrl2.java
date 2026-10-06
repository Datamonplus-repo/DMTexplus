package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbrl2", "/app.talbrl2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbrl2 extends GXWebObjectStub
{
   public talbrl2( )
   {
   }

   public talbrl2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbrl2.class ));
   }

   public talbrl2( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbrl2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbrl2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Almacén";
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

