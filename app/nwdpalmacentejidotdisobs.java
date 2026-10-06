package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpalmacentejidotdisobs", "/app.nwdpalmacentejidotdisobs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpalmacentejidotdisobs extends GXWebObjectStub
{
   public nwdpalmacentejidotdisobs( )
   {
   }

   public nwdpalmacentejidotdisobs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpalmacentejidotdisobs.class ));
   }

   public nwdpalmacentejidotdisobs( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpalmacentejidotdisobs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpalmacentejidotdisobs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPAlmacen Tejido TDISOBS";
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

