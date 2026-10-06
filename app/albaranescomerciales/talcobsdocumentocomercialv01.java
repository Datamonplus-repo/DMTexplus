package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranescomerciales.talcobsdocumentocomercialv01", "/app.albaranescomerciales.talcobsdocumentocomercialv01"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talcobsdocumentocomercialv01 extends GXWebObjectStub
{
   public talcobsdocumentocomercialv01( )
   {
   }

   public talcobsdocumentocomercialv01( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talcobsdocumentocomercialv01.class ));
   }

   public talcobsdocumentocomercialv01( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talcobsdocumentocomercialv01_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talcobsdocumentocomercialv01_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALCOBSDocumento Comercialv01";
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

