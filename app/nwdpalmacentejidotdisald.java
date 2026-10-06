package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpalmacentejidotdisald", "/app.nwdpalmacentejidotdisald"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpalmacentejidotdisald extends GXWebObjectStub
{
   public nwdpalmacentejidotdisald( )
   {
   }

   public nwdpalmacentejidotdisald( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpalmacentejidotdisald.class ));
   }

   public nwdpalmacentejidotdisald( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpalmacentejidotdisald_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpalmacentejidotdisald_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPAlmacen Tejido TDISALD";
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

