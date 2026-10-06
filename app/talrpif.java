package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talrpif", "/app.talrpif"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talrpif extends GXWebObjectStub
{
   public talrpif( )
   {
   }

   public talrpif( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talrpif.class ));
   }

   public talrpif( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talrpif_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talrpif_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Fibras de las Piezas";
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

