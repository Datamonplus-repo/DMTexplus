package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrproduc", "/app.ttrproduc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrproduc extends GXWebObjectStub
{
   public ttrproduc( )
   {
   }

   public ttrproduc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrproduc.class ));
   }

   public ttrproduc( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrproduc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrproduc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Trn PRODUC";
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

