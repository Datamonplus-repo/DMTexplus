package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnprovprdgeneral", "/app.tnprovprdgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnprovprdgeneral extends GXWebObjectStub
{
   public tnprovprdgeneral( )
   {
   }

   public tnprovprdgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnprovprdgeneral.class ));
   }

   public tnprovprdgeneral( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnprovprdgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnprovprdgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tn PROVPRDGeneral";
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

