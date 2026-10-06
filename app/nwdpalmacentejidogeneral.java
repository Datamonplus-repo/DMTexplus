package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpalmacentejidogeneral", "/app.nwdpalmacentejidogeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpalmacentejidogeneral extends GXWebObjectStub
{
   public nwdpalmacentejidogeneral( )
   {
   }

   public nwdpalmacentejidogeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpalmacentejidogeneral.class ));
   }

   public nwdpalmacentejidogeneral( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpalmacentejidogeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpalmacentejidogeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPAlmacen Tejido General";
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

