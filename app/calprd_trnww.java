package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calprd_trnww", "/app.calprd_trnww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class calprd_trnww extends GXWebObjectStub
{
   public calprd_trnww( )
   {
   }

   public calprd_trnww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( calprd_trnww.class ));
   }

   public calprd_trnww( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new calprd_trnww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new calprd_trnww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Albaran de Produccion";
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

