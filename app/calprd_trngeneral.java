package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calprd_trngeneral", "/app.calprd_trngeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class calprd_trngeneral extends GXWebObjectStub
{
   public calprd_trngeneral( )
   {
   }

   public calprd_trngeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( calprd_trngeneral.class ));
   }

   public calprd_trngeneral( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new calprd_trngeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new calprd_trngeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Calprd_TRNGeneral";
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

